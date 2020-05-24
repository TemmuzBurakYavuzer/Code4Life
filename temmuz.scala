import math._
import scala.util._
import scala.io.StdIn._
import scala.util.control._
import scala.collection.mutable.ArrayBuffer

object Player extends App { val projectCount = readLine.toInt
    for(i <- 0 until projectCount) {val Array(a, b, c, d, e) = (readLine split " ").map (_.toInt)}
class robot(yuk:Array[Int],hedef:String){val robot_yuk = yuk
    val robot_hedef = hedef}
class ornek(ornekId: Int, tasiyan: Int, can: Int, deger: Array[Int]){val o_ornekId = ornekId
   val o_tasiyan = tasiyan
   val o_can = can
   val o_deger = deger }
    while(true) {
        var robotlar = ArrayBuffer[robot]()
        for(i <- 0 until 2) {val Array(hedef, _eta, _score, _yukA, _yukB, _yukC, _yukD, _yukE, _expertiseA, _expertiseB, _expertiseC, _expertiseD, _expertiseE) = readLine split " "
            val eta = _eta.toInt
            val score = _score.toInt
            val yukA = _yukA.toInt;val yukB = _yukB.toInt;val yukC = _yukC.toInt;val yukD = _yukD.toInt;val yukE = _yukE.toInt;
            val yuk = Array(yukA,yukB,yukC,yukD,yukE)
            val robot = new robot (yuk, hedef)
            robotlar.append(robot)}
        val Array(availableA, availableB, availableC, availableD, availableE) = (readLine split " ").map (_.toInt)
        val ornekSayi = readLine.toInt
        val ornekler = ArrayBuffer[ornek]()
        for(i <- 0 until ornekSayi) {val Array(_ornekId, _tasiyan, _rank, expertiseGain, _can, _degerA, _degerB, _degerC, _degerD, _degerE) = readLine split " "
            val ornekId = _ornekId.toInt 
            val tasiyan = _tasiyan.toInt
            val rank = _rank.toInt
            val can = _can.toInt
            val degerA = _degerA.toInt;val degerB = _degerB.toInt;val degerC = _degerC.toInt;val degerD = _degerD.toInt;val degerE = _degerE.toInt;
            val deger = Array(degerA,degerB,degerC,degerD,degerE)
            val ornek = new ornek (ornekId,tasiyan,can,deger)
            ornekler.append(ornek)}
        val ben = robotlar(0)
        val index = 0
        var max_can = 0
        var b_ornek: ornek = null
        val loop = new Breaks;
        var molekule=ArrayBuffer[String]()
        molekule += "A";molekule += "B";molekule += "C";molekule += "D";molekule += "E";
        for (ornek <- ornekler){if(ornek.o_can> max_can && ornek.o_tasiyan!=1){max_can = ornek.o_can
        b_ornek = ornek }}

        if(b_ornek.o_tasiyan!=0){ Connect("DIAGNOSIS",b_ornek.o_ornekId,ben.robot_hedef)}
        else{var neededMolecule:String = null
            loop.breakable{for(i <- 0 until 5 ){
                if(ben.robot_yuk(i) < b_ornek.o_deger(i)){neededMolecule = molekule(i)
                    loop.break;}}}
            if(neededMolecule!=null){Connect2("MOLECULES",neededMolecule , ben.robot_hedef)}
            else{Connect("LABORATORY",b_ornek.o_ornekId, ben.robot_hedef)}}    }
    def Connect(module:String, id:Int ,hedef:String){
        if (module == hedef){println("CONNECT "+ id)}
        else{println("GOTO " + module)  }}
    def Connect2(module:String , typeId:String, hedef:String){
        if(module == hedef){println("CONNECT " + typeId.toString)}
        else{println("GOTO "+ module) }}
}