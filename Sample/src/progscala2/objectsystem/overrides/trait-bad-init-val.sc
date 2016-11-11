// src/main/scala/progscala2/objectsystem/overrides/trait-bad-init-val.sc
// 오류: 'value'를 초기화하기 전에 읽음
object tst_trait_bad_init_val {
	trait AbstractT2 {
	  println("In AbstractT2:")
	  val value: Int
	  lazy val inverse = 1.0/value      // <1>
	  println("AbstractT2: value = "+value+", inverse = "+inverse)
	}
	
	val obj = new AbstractT2 {
	  println("In obj:")
	  val value = 10
	}                                         //> In AbstractT2:
                                                  //| AbstractT2: value = 0, inverse = Infinity
                                                  //| In obj:
                                                  //| obj  : tst_trait_bad_init_val.AbstractT2 = tst_trait_bad_init_val$$anonfun$m
                                                  //| ain$1$$anon$1@36d64342
	println("obj.value = "+obj.value+", inverse = "+obj.inverse)
                                                  //> obj.value = 10, inverse = Infinity
}