package rXJava

import io.reactivex.rxjava3.core.Observable

fun main(){
    Observable.just("Titanic", "Conjuring", "Cars")
        .subscribe(
            { item -> println("latest item is $item") }, // This is onNext Block
            { error -> println("Error is $error") }, // This is onError Block
            { println("Task got completed") }  // This is onComplete Block
        )
    Observable.just("Hasnain", "Altaf").subscribe { item -> println(item) }
}