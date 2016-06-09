/**
 * Created by shubham on 9/6/16.
 */
List a = [2,45,46,3,6,17,40,35,20]
List b = []
a.each { item ->
    if(item>20){
        b.push(item)
    }
}
b.each {
    println it
}
List c = [2,45,46,3,6,17,40,35,20]
List d = []
println c.find {xyz ->
    return xyz>20
}
println c.findAll{
    return it>20
}