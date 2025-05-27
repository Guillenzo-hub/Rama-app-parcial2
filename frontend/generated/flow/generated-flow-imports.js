import '@vaadin/tooltip/src/vaadin-tooltip.js';
import '@vaadin/polymer-legacy-adapter/style-modules.js';
import '@vaadin/button/src/vaadin-button.js';
import 'Frontend/generated/jar-resources/buttonFunctions.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/common-frontend/ConnectionIndicator.js';
import '@vaadin/vaadin-lumo-styles/color-global.js';
import '@vaadin/vaadin-lumo-styles/typography-global.js';
import '@vaadin/vaadin-lumo-styles/sizing.js';
import '@vaadin/vaadin-lumo-styles/spacing.js';
import '@vaadin/vaadin-lumo-styles/style.js';
import '@vaadin/vaadin-lumo-styles/vaadin-iconset.js';

const loadOnDemand = (key) => {
  const pending = [];
  if (key === 'f1eee7c35ab200a59fc38c514856a4f2710027adc64b64bdda9549349c81e859') {
    pending.push(import('./chunks/chunk-ef4e27daf9cbae0a88187433b47dc7469392ea49169e3602ad6cf0b479cca810.js'));
  }
  if (key === 'a9dd1d432230f98dab150c26eebf89c542eddc9b80f9b17ad0d67f93285c74b2') {
    pending.push(import('./chunks/chunk-2b85016f1cabb717e4158dae3c8677ae41f9291654ee67baa2145b62651a1f1d.js'));
  }
  if (key === 'd7ec4635d62f12d99abb1b1b9763dc65eff3b872607481de96e07688a911e71b') {
    pending.push(import('./chunks/chunk-975fb8a3e1d255fd3c42d4925f8b2a34cca3c1dacd4a2e20a64c81450711bf85.js'));
  }
  if (key === '9d5c9c3549706afb7064682f255b68a996a540823ba2298e26749d34db4fa719') {
    pending.push(import('./chunks/chunk-975fb8a3e1d255fd3c42d4925f8b2a34cca3c1dacd4a2e20a64c81450711bf85.js'));
  }
  if (key === '164840db58f2873114272b78d79f4788ff177a30b8b410530b90a8a226edba07') {
    pending.push(import('./chunks/chunk-975fb8a3e1d255fd3c42d4925f8b2a34cca3c1dacd4a2e20a64c81450711bf85.js'));
  }
  return Promise.all(pending);
}

window.Vaadin = window.Vaadin || {};
window.Vaadin.Flow = window.Vaadin.Flow || {};
window.Vaadin.Flow.loadOnDemand = loadOnDemand;
window.Vaadin.Flow.resetFocus = () => {
 let ae=document.activeElement;
 while(ae&&ae.shadowRoot) ae = ae.shadowRoot.activeElement;
 return !ae || ae.blur() || ae.focus() || true;
}