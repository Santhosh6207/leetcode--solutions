class Solution { 
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
    String vowels = "aeiouAEIOU";
    String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
    return word.matches("[a-zA-Z0-9]*") && 
           word.matches(".*[" + vowels + "].*") && 
           word.matches(".*[" + consonants + "].*");
        
    }
}