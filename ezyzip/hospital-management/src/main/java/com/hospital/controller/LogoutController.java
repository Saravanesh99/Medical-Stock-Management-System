????   4 I  com/hospital/model/Todo  java/lang/Object id J RuntimeVisibleAnnotations Ljavax/persistence/Id; "Ljavax/persistence/GeneratedValue; strategy "Ljavax/persistence/GenerationType; AUTO userName Ljava/lang/String; medicineName quantity I description 
targetDate Ljava/util/Date; getMedicineName ()Ljava/lang/String; Code	     LineNumberTable LocalVariableTable this Lcom/hospital/model/Todo; setMedicineName (Ljava/lang/String;)V getQuantity ()I	  #   setQuantity (I)V <init> ()V
  ) & ' K(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ILjava/lang/String;Z)V	  ,  	  .  	  0   user desc isDone Z getId ()J	  8   setId (J)V getUserName setUserName getDescription setDescription getTargetDate ()Ljava/util/Date; setTargetDate (Ljava/util/Date;)V 
SourceFile 	Todo.java Ljavax/persistence/Entity; Ljavax/persistence/Table; name todos !                  	  
e                                    /     *? ?                                >     *+? ?       
    $  %                      !     /     *? "?           (              $ %     >     *? "?       
    ,  -                    & '     3     *? (?       
    0  1              & *     ?      *? (*+? +*,? -*-? /*? *? "?           4  5 	 6  7  8  9  :    H              1       2                            3 4   5 6     /     *? 7?           =              9 :     >     *? 7?       
    A  B                    ;      /     *? +?           E              <      >     *+? +?       
    I  J                    =      /     *? -?           M              >      >     *+? -?       
    Q  R                    ? @     /     *? /?           U              A B     >     *+? /?       
    Y  Z                    C    D      E   F  Gs H