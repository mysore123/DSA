let input = [1, 2, [3, 4],[[9,8],10,11,[12,[13,[14,15]]]]]

let output = []
function flattenArray(arr) {
  let i = 0;
  while (i < arr.length) {
  	if (Array.isArray(arr[i])) {
    	flattenArray(arr[i]) 
    }
    else {
    	output.push(arr[i])
    }  
    i++
  }
}

flattenArray(input)
console.log(output)
