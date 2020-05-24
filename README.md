## Code4Life Bot

**Group Members:** TEMMUZ BURAK YAVUZER

## Explanations about the code

* Code is written in Turkish.If you know turkish you can easily understand the
code.I also used Scala for my approach for Code4Life bot on codingame.com.
To be honest python would be much more efficent for that contest but I wanted
to learn Scala.There is also good tutorial on youtube which uses python.

* In this project main approach has *4 steps.*

* Those steps are selecting a sample,then collecting that sample, acquiring
the monecules needed to research that sample, and than producing the medicine
for that sample

* First we need to select the sample.I created a class called ornek.Basicly 
ornek means sample in turkish.As constructer we have id as ornekId,health
as can,carried by who as tasinan and value as deger.I created a class 
called robot.As a constructer have storage "yuk" and target"hedef"

* After that we have to choose one of those samples.To choose the samples
I used health as a parameter.I had a loop which helps me to choose best sample.
b_ornek means better sample.Basicly just swaping the healths between max_can
and ornek_can.

* Now I can go to diagnosis machine and collect that sample.I have 2 connect
function.If our position is at the desired module then I "print" the "connect"
with the data which is id.If it is not in the correct module then we should
"GOTO" correct module.Now I can determine If we are holding the molecules.
If we need monecules then "GOTO" connect to the monecules neededmonecules.
If we dont need molecules then we need to "GOTO" the "LABORATORY" look for the
b_ornek id. depends on the storage and the b_ornek cost.If my storage is 
greater or equal to the cost of our sample for each molecule type then
neededmolecule will become a element from Array.If needed molecule is not 
none we collect it .If needed molecule is not null then connect to molecules
by using target 