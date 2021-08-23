fun main(){
    for(i in 1..10){
        if(i == 3){
            break
        }
        print(i)
    }

    println()

    for(i in 1..10){
        if(i == 3){
            continue
        }
        print(i)
    }

    println()


    /**
     * i 와 j를 모두 체크 해야 할 때,
     * 기존의 프로그램에서는 두 번의 break 문을 추가해야 추가 해야 됩니다
     */
    for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 2) break
        }
        if(i == 1) break
    }

    println()

    /**
     * 하지만, 코틀린에서는 loop@를 사용하여 반복을 피할 수 있다
     * 추가로 '$' 표시를 붙여준다면 변수 내용으로 대체되어 출력됩니다
     */
    loop@for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }
    }
}