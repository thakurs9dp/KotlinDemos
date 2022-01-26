package com.kt.demos.sealed
//A sealed classes defines a set of subclasses within it
//Sealed classes is type-Safety by restricting the types to be matched at compile-time rather then run time
sealed class KSealed
data class Successes (val data : String) : KSealed()
data class Failure(val t : Throwable) : KSealed()


fun getState(kSealed: KSealed) : Any {
    return when(kSealed) {
        is Successes -> {
            kSealed.data
        }
        is Failure -> {
            kSealed.t
        }
    }
}


sealed class KKSealed : Test1, Test2  {
     data class A(val data: String) : KKSealed()
     data class B(val t : Throwable) : KKSealed()
}

sealed interface Test1 {
    data class A(val data: String) : Test1
    object Loading : Test1
}

sealed interface Test2 {
    data class A(val data: String) : Test2
    object Loading : Test2
}


fun getLoadState(kSealed : Test1) : Any{
    return when(kSealed) {
        is Test1.A->{

        }
        is  Test1.Loading ->{

        }
        is KKSealed.A -> {

        }
        is KKSealed.B -> {

        }
    }
}

