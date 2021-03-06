# MVVM_PROJECT
Testing MVVM in android

イントロダクション
個人的には、MVVMは（ほとんどの場合）コードを構造化するための最良の方法だと思います。
- 私が一番気に入っているのは、プロジェクト内のさまざまなコンポーネントの区画化です。
- UIコンポーネントはビジネスロジックから遠ざけられます
- ビジネスロジックはデータベース操作から遠ざけられます
- 読みやすいです（すべてに特定の住む場所があるため）
- そして、正しく行われていれば、ライフサイクルイベントに関して心配する必要はずっと少なくなります（例：画面の回転）。


REPOSITORY 

リポジトリクラスはデータ操作を処理します。リポジトリを作成することは、アプリケーションがデータを取得する方法と、そのデータをどのように使用または表示するかを明確に区別するための明確な方法です。
リポジトリは、どこからデータを取得するか（例：どのREST APIをクエリするか、どの内部SQLiteデータベースをクエリするかなど）、およびデータが更新されたときにどのAPI呼び出しを行うかを知っています。リポジトリは、永続モデル、Webサービス、キャッシュなど、さまざまなデータソース間のメディエータと考えることができます。


ViewModel

Androidの開発に関しては、多くの概念と命名規則が非常に誤解を招く可能性があります。たとえばHandlerThreadクラスを取ります。あなたが私に尋ねるなら、HandlerThreadはこのクラスの良い名前ではありません。標準のThreadクラスと異なるのは、Handlerがあるという事実ではありません。それは実際には組み込みのルーパーメカニズムです。これは、Android SDKの命名規則を混乱させる多くの例の1つにすぎません。
一方、ViewModelクラスはその名前で完全に記述されています。見方をすると、それはモデルです。ビューはフラグメントまたはアクティビティです。モデルは何でも構いません。ビューに表示したいデータのモデルです。
ViewModelは他のコンポーネントにデータを取得するように指示し（たとえばリポジトリ）、ユーザーからの着信要求を処理してデータを変更することができます（たとえば、ユーザーはリスト要素でいっぱいのRecycerViewに新しい要素を追加します）。
リポジトリと同様に、ViewModelは別の形式のメディエーションです。データセット（リポジトリで表される）を取得または更新する動作と、UIの現在の状態を区別します。 ViewModelはアクティビティやフラグメントのライフサイクルについて知りません。設定の変更があっても構いません。唯一の懸念は、ビューのデータへの正確な参照を保持することです。ユーザーがアプリを閉じて数時間後に再び開いた場合、ユーザーはアプリを閉じたときとまったく同じものになります。


