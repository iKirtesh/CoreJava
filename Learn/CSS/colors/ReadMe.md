### COLORS IN CSS

#### Color Properties: CSS provides several ways to define colors.

- You can use named colors
  - (e.g., "red"), hexadecimal values
  - (e.g., "#FF5733"), RGB values
  - (e.g., "rgb(255, 87, 51)"), or HSL values
- Understanding how to apply colors to text and backgrounds is essential for creating visually appealing designs.

### Notes: Colors using Various Notations

- Color can really bring your pages to life.
- The color property allows you to specify the color of text inside an element. You can specify any color in CSS in one of three ways:

  - RGB values
  - hex codes
  - color names

- RGBA Colors: RGBA is similar to RGB but includes an alpha channel for opacity control.

### MORE ON COLORS

- CSS3 has introduced an extra value for RGB colors to indicate opacity. It is known as RGBA.
- CSS3 also allows you to specify colors as HSL values, with an optional opacity value. It is known as HSLA.

### Summary: COLOR

- Color not only brings your site to life, but also helps convey the mood and evokes reactions.

1. How can you make the text color of an element fully transparent using CSS? Provide an example.

   ```css
   p {
     color: rgba(0, 0, 0, 0);
   }
   ```

2. How can you set the text color of an element to match the current color of another CSS property within the same element?
   ```css
   p {
     color: currentColor;
     background-color: #000;
   }
   ```
