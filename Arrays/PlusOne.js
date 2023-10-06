/**
 * Plus One
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/
 * 
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

 */

/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
  let copyArr = digits;
  if (digits.length > 1) {
    copyArr.reverse();
  }
  let finalArr = [];
  let carry = 0;
  for (let i = 0; i <= digits.length - 1; i++) {
    const char = i === 0 ? copyArr[i] + 1 + carry : copyArr[i] + carry;
    if (char < 10) {
      finalArr.push(char);
      carry = 0;
    } else {
      finalArr.push(0);
      carry = 1;
    }
  }
  if (carry === 1) {
    finalArr.push(1);
  }
  return finalArr.reverse();
};
