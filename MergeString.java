class MergeString {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int i = 0, j = 0;

        // Mezclar caracteres de ambos strings alternadamente
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merge.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                merge.append(word2.charAt(j));
                j++;
            }
        }

        return merge.toString();  
    }

    public static void main(String[] args) {
        MergeString sol = new MergeString();
        System.out.println(sol.mergeAlternately("abc", "pqr"));  // Salida esperada: "apbqcr"
        System.out.println(sol.mergeAlternately("ab", "pqrs"));  // Salida esperada: "apbqrs"
    }
}