// Sum of integers between a and b
def sumInts(a: Int, b: Int): Int =
  if(a > b) 0 else a + sumInts(a + 1, b)

sumInts(2, 4)


// Cube of an integer
def cube(x: Int): Int = x * x * x

cube(2)
cube(3)
cube(4)

// Sum of cubes of integers between a and b
def sumCubes(a: Int, b: Int): Int =
  if(a > b) 0 else cube(a) + sumCubes(a + 1, b)

sumCubes(2,4)


// Factorial function
def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n-1)

factorial(2)
factorial(3)
factorial(4)

// Sum of factorials of integers between a and b
def sumFactorials(a: Int, b: Int): Int =
  if(a > b) 0 else factorial(a) + sumFactorials(a + 1, b)

sumFactorials(2, 4)

// General Sum function
def sumF(f: Int => Int, a: Int, b: Int): Int =
  if(a > b) 0 else f(a) + sumF(f, a + 1, b)

// Sum function tail recursive
def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}

sum(x => x * x * x, 2, 4)


