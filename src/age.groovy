/**
 * Created by shubham on 9/6/16.
 */
class Age1 {
    String firstName
    String lastName
    String email_id
    int age
}
Map m =[firstName:"Shubham",lastName:"Jain S",email_id:"Shubham.shubh1501@gmail.com",age:21]
Map m1 =[firstName:"Sagar",lastName:"Jain ",email_id:"Shubham.shubh1501@gmail.com",age:155]
Map m2 =[firstName:"Smita",lastName:"Pallem",email_id:"Shubham.shubh1501@gmail.com",age:36]
Map m3 =[firstName:"Priyal",lastName:"Singhal",email_id:"Shubham.shubh1501@gmail.com",age:42]
Map m4 =[firstName:"Praveen",lastName:"Tahalyani",email_id:"Shubham.shubh1501@gmail.com",age:111]
Age1 p=new Age1(m)
Age1 p1=new Age1(m1)
Age1 p2=new Age1(m2)
Age1 p3=new Age1(m3)
Age1 p4=new Age1(m4)

List x= [p,p1,p2,p3,p4]
List c = []
List d =[]
x.each{xyz ->
    if(xyz.age>100){
        c.push("${xyz.firstName} ${xyz.lastName} (${xyz.age})");
    }
    else {
        d.push("${xyz.firstName} ${xyz.lastName} (${xyz.age})");
    }
}
println c
println d