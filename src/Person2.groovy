/**
 * Created by shubham on 8/6/16.
 */
class Person3 {
    String firstName
    String lastName
    String email_id
    int age

    String toString() {
       return " ${firstName} ${lastName} (${age})"
    }
}
Map m =[firstName:"Shubham",lastName:"Jain S",email_id:"Shubham.shubh1501@gmail.com",age:21]
Map m1 =[firstName:"Sagar",lastName:"Jain ",email_id:"Shubham.shubh1501@gmail.com",age:21]
Map m2 =[firstName:"Smita",lastName:"Pallem",email_id:"Shubham.shubh1501@gmail.com",age:21]
Map m3 =[firstName:"Priyal",lastName:"Singhal",email_id:"Shubham.shubh1501@gmail.com",age:21]
Map m4 =[firstName:"Praveen",lastName:"Tahalyani",email_id:"Shubham.shubh1501@gmail.com",age:21]
Person3 p=new Person3(m)
Person3 p1=new Person3(m1)
Person3 p2=new Person3(m2)
Person3 p3=new Person3(m3)
Person3 p4=new Person3(m4)

List x= [p,p1,p2,p3,p4]
x.each{xyz ->
    println xyz

}