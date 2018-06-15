package variable
/**
 * 闭包基本使用
 */
//def clouser = {println "Hello ${it}"}
//clouser.call("Groovy")
//clouser("Groovy")
//def name = "Java"
//clouser(name)

def clouser = { String name, int age ->
    println "My name is ${name},${age}"
}

def sum = { def a, def b -> return a + b }

//println sum(3, 2)

int fab1(int num) {
    int result = 1
    1.upto(num) { result *= it }
    return result
}

int fab2(int num) {
    int result = 1
    num.downto(1) { result *= it }
    return result
}

int acc(int num) {
    int result
    num.times {
//        println it
        result += it }
    return result
}

//println fab1(5)
//
//println fab2(5)

//println acc(101)
/*
 字符串与闭包结合使用
 */
String str = "The 2 and 3 is 5"
//each的遍历
//str.each {
//    print it
//}
//find 查找符合条件的第一个
//println str.find{
//    it.isNumber()
//}
//查找符合条件的全部，加入list
//def list = str.findAll {it.isNumber()}
//println list

//判断是否包含
//println str.any {it.isNumber()}
//每一项是否都满足闭包中的条件
//println str.every {it.isNumber()}

//将每一项进行闭包化处理并加到list中
println str.collect {it.toUpperCase()}

/*
闭包的三个重要变量：this owner delegate
 */