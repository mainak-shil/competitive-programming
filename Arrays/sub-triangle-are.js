//https://www.geeksforgeeks.org/sum-triangle-from-array/
function sumTriangle(array) {
  // console.log(array);
  if (array.length === 1) {
    console.log(array);
    return array;
  }
  const newArr = addUpSums(array);
  sumTriangle(newArr);
  console.log(newArr);
}

function addUpSums(array) {
  let arr = [];
  // console.log(array);
  for (i = 1; i <= array.length - 1; i++) {
    let sum = array[i - 1] + array[i];
    arr.push(sum);
  }
  return arr;
}
// const array = [1, 2, 3, 4, 5, 7, 8];
// sumTriangle(array);
// console.log(array);

//----------- return all in 2d array [[],[]]

function sumTriangle2(array, new2dArray, arrLength) {
  const newArr = addUpSums(array);
  if (arrLength === new2dArray.length) {
    return new2dArray;
  }
  let lll = new2dArray;
  if (new2dArray?.length === 0) {
    lll = newArr;
  } else {
    lll.push(newArr);
  }
  return sumTriangle2(newArr, lll, arrLength);
}
const array2 = [1, 2, 3, 4, 5];
let final = sumTriangle2(array2, [[1, 2, 3, 4, 5]], array2.length);
console.log("final", final);
