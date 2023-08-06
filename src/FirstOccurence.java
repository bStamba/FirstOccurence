public class FirstOccurence {

    public int strStr(String haystack, String needle){
        int occurenceIndex = -1;
        //Two String variables needle and haystack
        //Return the index of the first occurence of needle in haystack
        if(haystack.contains(needle)){
            occurenceIndex = haystack.indexOf(needle);
            return occurenceIndex;
        }
        else{
            return occurenceIndex;
        }
    }
}
