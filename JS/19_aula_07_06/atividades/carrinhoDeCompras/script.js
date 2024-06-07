const productList = document.getElementById('productList');
const cartTable = document.getElementById('cartTable').getElementsByTagName('tbody')[0];
const cartTotal = document.getElementById('cartTotal');

let cart = {};

// Adicionar ao carrinho
productList.addEventListener('click', (event) => {
    console.log(event);
    if (event.target.classList.contains('addToCart')) {
        const productId = event.target.dataset.productId;
        addToCart(productId);
    }
});

// Atualizar quantidade
cartTable.addEventListener('input', (event) => {
    if (event.target.classList.contains('quantityInput')) {
        updateQuantity(event.target.dataset.itemId, event.target.value);
    }
});

// Remover do carrinho
cartTable.addEventListener('click', (event) => {
    if (event.target.classList.contains('removeButton')) {
        removeFromCart(event.target.dataset.itemId);
    }
});

// Funções do carrinho
function addToCart(productId) {
    if (cart[productId]) {
        cart[productId].quantity++;
    } else {
        const product = getProductById(productId);
        cart[productId] = {
            id: productId,
            name: product.name,
            price: product.price,
            quantity: 1
        };
    }
    updateCart();
}

function updateQuantity(itemId, newQuantity) {
    cart[itemId].quantity = newQuantity;
    updateCart();
}

function removeFromCart(itemId) {
    delete cart[itemId];
    updateCart();
}

function updateCart() {
    cartTable.innerHTML = '';
    let total = 0;
    for (const itemId in cart) {
        const item = cart[itemId];
        const row = cartTable.insertRow();
        row.insertCell().textContent = item.name;
        row.insertCell().textContent = `R$ ${item.price.toFixed(2)}`;
        const quantityCell = row.insertCell();
        const quantityInput = document.createElement('input');
        quantityInput.type = 'number';
        quantityInput.min = 1;
        quantityInput.value = item.quantity;
        quantityInput.classList.add('quantityInput');
        quantityInput.dataset.itemId = itemId;
        quantityCell.appendChild(quantityInput);
        row.insertCell().textContent = `R$ ${(item.price * item.quantity).toFixed(2)}`;
        const removeCell = row.insertCell();
        const removeButton = document.createElement('button');
        removeButton.textContent = 'Remover';
        removeButton.classList.add('removeButton');
        removeButton.dataset.itemId = itemId;
        removeCell.appendChild(removeButton);
        total += item.price * item.quantity;
    }
    cartTotal.textContent = `R$ ${total.toFixed(2)}`;
}

function getProductById(productId) {
    const productItem = document.querySelector(`li[data-product-id="${productId}"]`);
    const productName = productItem.querySelector('h3').textContent;
    const productPrice = parseFloat(productItem.querySelector('p').textContent.replace('R$ ', ''));
    return {
        id: productId,
        name: productName,
        price: productPrice
    };
}