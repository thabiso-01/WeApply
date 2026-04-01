'use strict';

// Function to get current date and time in UTC
function getCurrentDateTime() {
    const now = new Date();
    return now.toISOString().slice(0, 19).replace('T', ' ');
}

// Log current date and time
console.log(`Current Date and Time (UTC): ${getCurrentDateTime()}`);

// Call the function at regular intervals
setInterval(() => {
    console.log(`Current Date and Time (UTC): ${getCurrentDateTime()}`);
}, 10000); // Update every 10 seconds
