const findMissingLetter = (array) => {
    for (let i = 1; i < array.length; i++) {
      const prev = array[i - 1].charCodeAt();
      const current = array[i].charCodeAt();
      
      if (current - prev !== 1) {

        return String.fromCharCode(prev + 1);
      }
      else{
          return String.fromCharCode(array[array.length - 1].charCodeAt(0) + 1); 
      }
    }
    
    return null;
  }

  console.log(findMissingLetter("abcde"));