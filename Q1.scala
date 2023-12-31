object Q1 extends App {
  val obj = new Rational(1,2)
  println("Negation of the number : " +obj.neg)
}

  class Rational(n:Int, d:Int) {
    require(denom != 0, "Denominator cannot be 0")
    def numer = n
    def denom = d

    def neg = new Rational(-this.numer, this.denom)

    override def toString(): String = numer + "/" + denom

}
