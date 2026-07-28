package control_statements;

public class freqOfNo {
    public static void main(String[] args) {
        int arr[]={1,12,3,40,15,6,40,1};
        boolean freq[]=new boolean[arr.length];
         for (int i = 0; i < arr.length; i++) {
             int count = 1;
            if (freq[i]) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = true;
                }
            }

            System.out.println(arr[i] + ": " + count);
        }

    
    }
}
