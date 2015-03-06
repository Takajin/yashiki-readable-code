著者名を記載

URL:https://github.com/Fermithrax77/Fermithrax77-readable-code/blob/master/SamplePJ/src/issue/RecipeOut.java

/*

author A.Kajiie */ public class RecipeOut {
}

理由：これは誰が書いたコードかモヤモヤせずに読める！！

引数などの説明がコメントで書いてある

URL: https://github.com/Takajin/szkayeah-readable-code/commit/d1a13d580d2bffec76ede3b9d7aba4194e68f67d

コード:

/**
* 実処理
*
* @param args
*/
理由: INとOUTが書かれていると、何をしてくれるメソッドなのかがわかるから。

メソッドの役割と引数の説明を記載

/*
 * recipe-data.txtを読み込んでレシピを出力するメソッド
 *
 * return ファイルから読み込んだ全てのデータ
 *
 */
 static public List<String> readRecipeFile() {
 }
理由：メソッドの中を読まなくてもどんな処理のメソッドかわかる！！

パッケージ及びクラス名

ファイル：https://github.com/WatanabeKouji/Fermithrax77-readable-code/blob/master/SamplePJ/src/sample/Test.java

package sample;

public class Test {

    /*
     * いろいろ記述
     */

}
理由：クラス名が長期にわたって使用されないことがわかる

変数名の名称

ファイル：https://github.com/WatanabeKouji/Fermithrax77-readable-code/blob/master/SamplePJ/src/issue/RecipeOut.java

List<String> recipes = readRecipeFile();
理由：複数の要素を保持していることが明確

　イテレーションの範囲が明確

ファイル：https://github.com/WatanabeKouji/Fermithrax77-readable-code/blob/master/SamplePJ/src/issue/RecipeOut.java

    for(String title : recipes) {
        System.out.println(title);
    }
理由：イテレーションの範囲が明確である。また、処理に分岐等のネストがないためことも明確な理由とおもわれる。

ネストが低い

ファイル：https://github.com/WatanabeKouji/Fermithrax77-readable-code/blob/master/SamplePJ/src/issue/RecipeOut.java

理由: 全体を通して、ネストが低いからよみやすいのかな？

著者名を記載

URL:https://github.com/Fermithrax77/Fermithrax77-readable-code/blob/master/SamplePJ/src/issue/RecipeOut.java

/*

author A.Kajiie */ public class RecipeOut {
}

理由：これは誰が書いたコードかモヤモヤせずに読める！！

メソッドの役割と引数の説明を記載

/*
 * recipe-data.txtを読み込んでレシピを出力するメソッド
 *
 * return ファイルから読み込んだ全てのデータ
 *
 */
 static public List<String> readRecipeFile() {
 }
理由：メソッドの中を読まなくてもどんな処理のメソッドかわかる！！

これからの実装方針の記載

https://github.com/Fermithrax77/WanatanabeKouji-readable-code/blob/master/src/order1.java

// メインメソッド // 極力何も書きたくない

理由：これから何をしたいのかわかる！！

メソッド名を処理内容に関係した名前にする

showStringAndReadRecipe(File recipe)

理由：どんな処理のメソッドかすぐわかる！！

変数名を役割の名前にする

java.io.BufferedReader buffer = new BufferedReader(new FileReader(recipeFile));

String recipe_data= buffer.readLine();

理由：一目みてバッファーであることがわかる。ほかのとこで変数を利用していてもわかりやすい！
