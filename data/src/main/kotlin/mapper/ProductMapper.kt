package mapper

import com.example.domain.model.Product

fun Product.toDataProduct() = model.Product(
    id, titleProduct, imageProduct, descriptionProduct, rating, price, quantity
)

fun model.Product.toDomainProduct() = Product(
    id, titleProduct, imageProduct, descriptionProduct, rating, price, quantity
)