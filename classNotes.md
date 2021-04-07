Class [DontPad](http://dontpad.com/seniorgodev)

Lecture 1 - Introductions to the course and to Scrum methodology. 

[Syllabus](https://docs.google.com/document/d/19-dlVDrPIym_2rkNCsoIf6mkorMVvGM4qlCDA6kr8H8/edit?usp=sharing).

	Grupo 4:
	- Marcelo
	- Willian K
	- Lorran
	- Gabriel 
	- Elton

Lecture 2 - Version control

* Historic, centralized repositories (past generations - SVN) versus distributed repositories (3rd gen - Git).


```
public class CountUppercase {
    static final int ITERATIONS = Math.max(Integer.getInteger("iterations", 1), 1);

    public static void main(String[] args) {
        String sentence = String.join(" ", args);
        for (int iter = 0; iter < ITERATIONS; iter++) {
            if (ITERATIONS != 1) {
                System.out.println("-- iteration " + (iter + 1) + " --");
            }
            long total = 0, start = System.currentTimeMillis(), last = start;
            for (int i = 1; i < 10_000_000; i++) {
                total += sentence
                  .chars()
                  .filter(Character::isUpperCase)
                  .count();
                if (i % 1_000_000 == 0) {
                    long now = System.currentTimeMillis();
                    System.out.printf("%d (%d ms)%n", i / 1_000_000, now - last);
                    last = now;
                }
            }
            System.out.printf("total: %d (%d ms)%n", total, System.currentTimeMillis() - start);
        }
    }
}
```


```
javac CountUppercase.java
java -XX:+UnlockExperimentalVMOptions -XX:+EnableJVMCI -XX:+UseJVMCICompiler
1 (1581 ms)
2 (480 ms)
3 (364 ms)
4 (231 ms)
5 (196 ms)
6 (121 ms)
7 (116 ms)
8 (116 ms)
9 (116 ms)
total: 59999994 (3436 ms)
```


```
javac CountUppercase.java
java -XX:+UnlockExperimentalVMOptions -XX:+EnableJVMCI -XX:-UseJVMCICompiler 
1 (510 ms)
2 (375 ms)
3 (365 ms)
4 (368 ms)
5 (348 ms)
6 (370 ms)
7 (353 ms)
8 (348 ms)
9 (369 ms)
total: 59999994 (4004 ms)
```



