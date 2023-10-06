/**
 * 
  Diagonal Iteration and Reversal
  https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/
  
  Best Approach
  *** get diagonal elements in map
  1 | 2,4 | 3,5,7 | 6,8 | 9

  then push based on odd position
 */
  var findDiagonalOrder = function (matrix) {
    if (matrix.length ===0) return [];
    
    let arrayMap = new Map();
    let result = [];
    
    // Storing all the diagonal value in the Map with i+j as a key
    for (let i = 0; i < matrix.length; i++) {
      for (let j = 0; j < matrix[0].length; j++) {
        if (!arrayMap.has(i + j)) {
          arrayMap.set(i + j, [matrix[i][j]]);
        } else {
          arrayMap.set(i + j, [...arrayMap.get(i + j), matrix[i][j]]);
        }
      }
    }
    console.log(arrayMap)
  
  
    let isDown = false;
  
    arrayMap.forEach((x) => {
      if (isDown) {
        result.push(...x);
      } else {
        result.push(...x.reverse());
      }
      isDown = !isDown;
    });
  
    return result;
  };
  
  console.log(findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))