/* Desc: In this kata, you must create a digital root function.
A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
*/

int add(int n) {
  int result = 0;
    
  while (n !=0) {
    result += n%10;
    n = n/10;
  }
  return result;
}

int digital_root(int n) {
  while (n > 9) {
    n = add(n);
  }
  return n;
}