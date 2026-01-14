package CoreJava;


sealed class SC1 permits SC2,SC3 {

}

final class SC2 extends SC1{

}

non-sealed class SC3 extends SC1{

}

sealed interface I1 permits I2{

}

non-sealed interface I2 extends I1{

}




public class SealedClassDemo {
}
