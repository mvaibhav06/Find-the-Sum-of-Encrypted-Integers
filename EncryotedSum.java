public class EncryotedSum {
    public static int sumOfEncryptedInt(int[] nums) {
        int counter = 0;
        int out = 0;

        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            while(a > 0){
                int temp = a%10;
                if(temp > out){
                    out = temp;
                }
                a = a/10;
                counter++;
            }
            int j = 0;
            int b = 0;
            while(j<counter){
                b = (b*10) + out;
                j++;
            }
            nums[i] = b;
            counter = 0;
            out = 0;
        }

        int sum1 = 0;
        for(int i=0; i<nums.length; i++){
            sum1 += nums[i];
        }
        return sum1;
    }

    public static void main(String[] args) {
        int[] nums = {6,53};
        System.out.println(sumOfEncryptedInt(nums));
    }
}
