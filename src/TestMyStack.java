public class TestMyStack {
     public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        int[] arr = {1,2,3,4,5};
//
//         for (int i = 0; i < arr.length; i++) {
//             stack.push(arr[i]);
//         }
//
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(stack.pop());
//         }
         MyStack<String> stack = new MyStack<>();
         String arr = "one";
         String[] arrays = new String[arr.length()];
         arrays = arr.split("");

         for (int i = 0; i < arrays.length; i++) {
             stack.push(arrays[i]);
         }

         for (int i = 0; i < arrays.length; i++) {
             System.out.println(stack.pop());
         }

    }
}
