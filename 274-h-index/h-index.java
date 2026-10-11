class Solution {
    public int hIndex(int[] citations) {
        int maxHIndex = 0;
        int maxPaper = 0;
        for(int i = 1 ; i<=citations.length;i++){
             int paperCount = 0;
             for(int j = 0 ; j<citations.length;j++){
                if(citations[j]>=i){
                    paperCount++;
                }
             }
             if(i>maxHIndex && (paperCount >=i)){
               maxHIndex=i; 
             }
        }
        return maxHIndex;
    }
}

// question means h is index of paper , and array elements is the citations
// of each paper.
// question is 
// "such that the given researcher has published at least h papers that have each been cited at least h times. "
// eg:- 
// Paper 1 → 3 citations
// Paper 2 → 0 citations
// Paper 3 → 6 citations
// Paper 4 → 1 citation
// Paper 5 → 5 citations

// if paper(index) is 1 then we need to find latest 1 paper who have atleast (1) citation.
// means 3>=1 , 6>=1 , 5>=1 so we have total thee papers whose citation is at least h index.
// if paper(index) is 2  then we need to find total 2 papers who have atleast (2) 
// citation