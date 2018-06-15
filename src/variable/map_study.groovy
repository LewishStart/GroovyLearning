package variable

//def colors = ['red': 'ff0000', 'green': '00ff00', 'blue': '0000ff']
//
////索引方式
//println "----------------索引----------------"
//println colors['red']
//println colors.blue
//println "------------------------------------"
////添加元素
//println "----------------添加----------------"
//colors.yellow = 'ffff00'
//println colors.toMapString()
//colors.complex = [a: 1, b: 1]
//println colors.toMapString()
//println "------------------------------------"
//println colors.getClass()

/**
 * Map操作详解
 */
def students = [
        1: [number: '0001', name: 'Bob', score: 55, sex: 'male'],
        2: [number: '0002', name: 'John', score: 62, sex: 'male'],
        3: [number: '0003', name: 'Claire', score: 73, sex: 'female'],
        4: [number: '0004', name: 'Amy', score: 66, sex: 'male'],
]
//遍历
//students.each {
//    student -> println "The key is ${student.key},the value is ${student.value}"
//}

//students.each {key,value -> println "key=${key}  value=${value} "}

//带索引的遍历
//students.eachWithIndex{  student, index ->
//    println "index=${index} key=${student.key}  value=${student.value} "
//}

//students.eachWithIndex{ key,value,index ->  println "index=${index} key=${key}  value=${value} "}

/**
 * Map的查找
 */
//println students.findAll {student -> student.value.score>60}

//println students.count {student -> student.value.score>60}

//println students.count {key,value->value.score>60}

//students.findAll {key,value->value.score>=60}.each {println it.value.name}

//def nameList = students.findAll {key,value->value.score>=60}.collect {it.value.name}
//
//println nameList

//def group = students.groupBy { key, value -> value.score >= 60 ? "及格" : "不及格" }
//println group.toMapString()

/**
 * 排序
 */
def sortedMap = students.sort { student1, student2 ->
    def score1 = student1.value.score
    def score2 = student2.value.score
    if (score1 == score2)
        return 0
    else if (score1 > score2)
        return 1
    else
        return -1
}
println sortedMap.toMapString()
