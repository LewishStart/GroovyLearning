package variable

//def list = new ArrayList()//java定义方式
//定义List
//def list = [1, 2, 3, 4, 5]
//
//println list.class
//println list.size()
////定义数组
//def array = [1, 2, 3, 4, 5] as int[]
//int[] array2 = [1, 2, 3, 4, 5]

/*
列表的排序
 */
//def sortList = [6, -3, 9, 2, -7, 1, 5]
//sortList.sort()
//println sortList
//
//def sortStringList = ["He","Groovy","Java"]
//sortStringList.sort {it.size()}
//println sortStringList

/*
列表的查找
 */
def findList = [-3, 9, 6, 2, -7, 1, 5]
//find
//int result = findList.find { it%2==0}
//println result
//findAll
//def result = findList.findAll{
//    it%2==0
//}
//println result
//any
//println findList.any {it==9}
//every
//println findList.every {it>0}
//println findList.min()

//println findList.max()
//count
//println findList.count {it>0}