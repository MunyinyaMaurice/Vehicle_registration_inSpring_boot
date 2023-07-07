using AspnetRunBasics.Repositories;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using System.Threading.Tasks;
using System;
using System.Collections.Generic;

namespace AspnetRunBasics.Pages
{
    public class ProductssModel : PageModel
    {
        public void OnPost()
        {
        }

            
            private readonly IProductRepository _productRepository;
            private readonly ICartRepository _cartRepository;

            public ProductssModel(IProductRepository productRepository, ICartRepository cartRepository)
            {
                _productRepository = productRepository ?? throw new ArgumentNullException(nameof(productRepository));
                _cartRepository = cartRepository ?? throw new ArgumentNullException(nameof(cartRepository));
            }

            // Other properties and methods omitted for brevity
            public List<Entities.Product> ProductInfo { get; set; } = new List<Entities.Product>();

            [BindProperty]
            public Entities.Product NewProduct { get; set; }

            public async Task<IActionResult> OnPostCreateProductAsync()
            {
                if (ModelState.IsValid)
                {
                    await _productRepository.CreateProduct(NewProduct);
                    return RedirectToPage("Index");
                }

                // If the model state is not valid, redisplay the form with the validation errors
                //CategoryList = await _productRepository.GetCategories();
                return Page();
            }
        }    
    }

    

