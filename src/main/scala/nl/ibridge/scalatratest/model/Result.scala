package nl.ibridge.scalatratest.model

  case class Data(id: Int, key: String, value: String) 
  
  case class Result(data: List[Data])
  
  object Result {
    val all = List(
        Data(1, "functie", "functie1"),
        Data(2, "functie", "functie2"),
        Data(3, "functie", "iets anders")
        )
  }