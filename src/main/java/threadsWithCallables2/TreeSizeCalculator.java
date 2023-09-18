package threadsWithCallables2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    Node root;
    ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService service) {
        this.root = root;
        this.executorService = service;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Scanner sc = new Scanner(System.in);
    }

    @Override
    public Integer call() throws Exception {
        if(root == null) return 0;
        Future<Integer> left = executorService.submit(new TreeSizeCalculator(root.left, executorService));
        Future<Integer> right = executorService.submit(new TreeSizeCalculator(root.right, executorService));
        return left.get() + right.get() + 1;
    }

}
