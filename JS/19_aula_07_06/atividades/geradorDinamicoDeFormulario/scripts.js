document.addEventListener('DOMContentLoaded', function() {
    const addFieldsButton = document.getElementById('addFieldsButton');
    const fieldContainer = document.getElementById('fieldContainer');

    addFieldsButton.addEventListener('click', () => {
        const newField = document.createElement('div');
        newField.classList.add('field');
        newField.innerHTML = `
            <label for="fieldInput">nome:</label>
            <input type="text" id="fieldInput" name="fieldInput">
            <input type="checkbox" id="fieldCheckbox" name="fieldCheckbox">
            <label for="fieldCheckbox">Selecionar</label>
            <button type="button" class="removeButton">Remover</button>
        `;
        fieldContainer.appendChild(newField);

        const removeButton = newField.querySelector('.removeButton');
        removeButton.addEventListener('click', () => {
            fieldContainer.removeChild(newField);
        });
    });
});
