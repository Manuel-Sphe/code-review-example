def is_palindrome(x)
    # return false if the input number is negative, as negative numbers cannot be palindromes
    if x < 0
      return false
    end
    
    # initialize variables to store the reversed number and the original number
    reversed = 0
    num = x
    
    # loop until all digits of the original number have been extracted and reversed
    while num != 0
      # extract the last digit of the original number
      extracted = num % 10
      # add the extracted digit to the reversed number, multiplied by 10 to move it into the next place value
      reversed = reversed * 10 + extracted
      # divide the original number by 10 to remove the extracted digit
      num = num / 10
    end
    
    # return true if the reversed number equals the original number, meaning it is a palindrome
    if reversed == x
      return true
    else
      # return false if the reversed number does not equal the original number, meaning it is not a palindrome
      return false
    end
  end
  