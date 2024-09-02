class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int n=players.length;
        int m=trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int l=0;
        int r=0;
        while(l<n&&r<m)
        {
            if(trainers[r]>=players[l])
            {
                l++;
                
            }
            r++;
        }
       return l; 
    }
}