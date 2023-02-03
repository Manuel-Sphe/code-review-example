// TypeScript Type: Alphabet
type Alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

// Function: Caesar Cipher
const caesar_cipher = (string: string, shift: number) => {
  // Alphabet
  const alphabet: Alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
  // Encoded Text
  let encodedText: string = '';

  // Ensure that the shift value is within the range of the alphabet (0-25)
  if (shift > 26) {
    shift = shift % 26;
  }

  let i: number = 0;
  // Loop through each character in the string
  while (i < string.length) {
    // Check if the current character is a valid alphabet character
    if (alphabet.indexOf(string[i]) !== -1) {
      // Find the index of the current character in the alphabet
      const alphabetIndex: number = alphabet.indexOf((string[i]).toUpperCase());

      // Check if the shifted alphabet index is within the range of the alphabet
      if (alphabet[alphabetIndex + shift]) {
        // Append the shifted character to the encoded text
        encodedText += alphabet[alphabetIndex + shift];
      } else {
        // If the shifted alphabet index is out of range, adjust it by 26 characters
        encodedText += alphabet[alphabetIndex + shift - 26];
      }
    }
    // If the current character is not a valid alphabet character, add it to the encoded text without shifting
    else {
      encodedText += string[i];
    }
    // Move on to the next character in the string
    i++;
  }

  // Return the encoded text
  return encodedText;
};
