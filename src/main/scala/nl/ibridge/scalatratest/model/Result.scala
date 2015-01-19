package nl.ibridge.scalatratest.model

  case class Data(id: String, value: Int)
  case class Result(data: List[Data])
  
  object Result {
    val all = List(
        Data("functie1", 1),
        Data("functie2", 3)
        )
  }