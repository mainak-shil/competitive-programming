//https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/
const palindrome = (org, neww) => {
  if (neww.length === org.length) {
    console.log(org, neww, org === neww);
    return org === neww;
  } else {
    return palindrome(org, neww + org.charAt(org.length - 1 - neww.length));
  }
};

const isPal = palindrome("1001", "");
console.log("isPal", isPal);
