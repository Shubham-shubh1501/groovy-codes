/**
 * Created by shubham on 8/6/16.
 */
class Person1 {
    String firstName
    String lastName
    String a
    String b
    float c
    int score
}
Map m =[firstName:"Hello",lastName:"Bolo",score:3,a:2,b:3,c:2.3]
Person1 p=new Person1(m)
println p.firstName
println p.lastName
println p.a
println p.b
println p.c
println p.score
