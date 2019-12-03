fun main(){
    var orgnumber : Int
    orgnumber = 22522
    if(palindrome(orgnumber))
    println("$orgnumber is palindrome")
    else
    println("$orgnumber is not a palindrome")
}

fun palindrome(x : Int) : Boolean {
    var number = x
	var revertedNumber = 0;

    if(number < 0 || (number % 10 == 0 && number != 0)) {
    return false
	}
	while(number > revertedNumber) {
    	revertedNumber = revertedNumber * 10 + x % 10;
    	number /= 10;
	}
	return number == revertedNumber || number == revertedNumber/10;    
}



