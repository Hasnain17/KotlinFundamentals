package rXJava

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers

fun main(){
    Observable.just(1, 2, 3, 4)
        .flatMap { item -> Observable.just(item + 2) }
        .subscribeOn(Schedulers.io())
        .subscribe { values -> callForValue(values) }
}

fun callForValue(values: Int) {
println(values)
}
