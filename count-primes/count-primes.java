class Solution {
    public int countPrimes(int n) {
        boolean primes[] = new boolean[n];
        int count = 0;
        for(int i =2;i*i<primes.length;i++){
            if(!primes[i]){
                for(int j = i;i*j<primes.length;j++){
                    primes[i*j] = true;
                }
            }
        }
        for(int i =2;i<primes.length;i++){
            if(!primes[i]) count++;
        }
        return count;
    }
}

// int count = 0, primeCount = 0; BRUTE FORCE
//         int temp =2;
//         while(temp<n){
//             for(int i =2;i<=temp;i++){
//                 if(temp%i==0) primeCount++;
//                 if(primeCount>2) break;
//             }
//             if(primeCount == 2) count++;
//             temp++;
//             primeCount = 0;
            
//         }
//         return count;