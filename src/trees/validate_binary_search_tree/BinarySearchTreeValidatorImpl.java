//package trees.validate_binary_search_tree;
//
//import trees.shared.TreeNode;
//
//public class BinarySearchTreeValidatorImpl implements BinarySearchTreeValidator {
//
//    @Override
//    public boolean isValidBST(TreeNode root) {
//        boolean valid = true;
//        if (root.right != null) {
//            valid = isValidBST(root.right, root.val + 1, Integer.MAX_VALUE, root.val, true);
//        }
//        if (root.left != null) {
//            valid = isValidBST(root.left, Integer.MIN_VALUE, root.val - 1, root.val, false);
//        }
//        return valid;
//    }
//
//    private boolean isValidBST(TreeNode node, int minValueForLeft, int maxValueForRight, int parentVal, boolean checkRightSide) {
//
//        if (checkRightSide && (node.val >= maxValueForRight || node.val <= parentVal)) {
//            return false;
//        }
//        if (!checkRightSide && (node.val <= minValueForLeft || node.val >= parentVal)) {
//            return false;
//        }
//
//        boolean valid = true;
//        if (node.right != null) {
//            valid = isValidBST(node.right, minValueForLeft, maxValueForRight, node.val, true );
//        }
//        if (node.left != null) {
//            valid = isValidBST(node.right, minValueForLeft, maxValueForRight, node.val, false );
//        }
//
//        return valid;
//    }
//}
