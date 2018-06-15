package file_study

def file = new File('../../GroovyLearning.iml')
//file.eachLine {println it}

//def text = file.getText()
//println text

//def result = file.readLines()//返回的是一个List
//println result

//def reader1 = file.withReader { reader ->
//    char[] buffer = new char[100]
//    reader.read(buffer)
//    return buffer
//}
//println reader1

def copy(String srcPath ,String desPath){
    def srcFile = new File(srcPath)
    def desFile = new File(desPath)
    if (!desFile.exists()){
        desFile.createNewFile()
    }
    if (!srcFile.exists()){
        return
    }
    srcFile.withReader {reader->
        def lines = reader.readLines()
        desFile.withWriter {writer->
            lines.each {
                writer.append(it+"\r\n")
            }
        }
    }
}

copy('../../GroovyLearning.iml','../../GroovyLearning2.iml')