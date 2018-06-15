package variable
/**
 * 循环
 */
//对范围的for循环
def sum = 0
for(i in 0..9)
    sum+=i
println sum
//对list的for循环
sum = 0
for(i in [0,1,2,3,4,5,6,7,8,9])
    sum+=i
println sum
//对map的循环
for (i in ['li':1,'lucy':2,'haha':3]){
    println "key=${i.key},value=${i.value}"
}

