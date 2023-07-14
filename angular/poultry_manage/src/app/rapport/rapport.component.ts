import { Component } from '@angular/core';
import { Chart } from 'chart.js';
import { PouleService } from '../services/poule.service';


@Component({
  selector: 'app-rapport',
  templateUrl: './rapport.component.html',
  styleUrls: ['./rapport.component.css']
})
export class RapportComponent {
  venteChart!: Chart;
  pouleChart!: any;
  oeufChart!: any;
  depenseChart!: any;
  errorMessage!: string;

  constructor(private pouleService: PouleService) { }

  ngOnInit(): void {
    // Récupérer les données de ventes
    const salesData = [100, 200, 300, 400, 500, 400, 500, 400, 500, 300, 400, 500];
    let pouleData! : number[]
   
    this.pouleService.stockTotalAnnuel().subscribe({
      next: (value) => {
        pouleData = value;
      }
    })

    // Créer le graphique de ventes
    this.venteChart = new Chart('salesChart', {
      type: 'bar',
      data: {
        labels: ['January', 'February', 'March', 'April', 'May', 'June', 'july', 'August', 'September', 'November', 'December'],
        datasets: [{
          label: 'Sales',
          data: salesData,
          borderColor: 'blue',
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
        }
      }
    });

    this.pouleChart = new Chart('poules', {
      type: 'bar',
      data: {
        labels: ['January', 'February', 'March', 'April', 'May', 'June', 'july', 'August', 'September', 'November', 'December'],
        datasets: [{
          label: 'Poules en stock',
          data: pouleData,
          borderColor: 'black',
          borderWidth: 1,

        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
        }
      }
    });
    this.oeufChart = new Chart('oeufs', {
      type: 'pie',
      data: {
        labels: ['January', 'February', 'March', 'April', 'May', 'June', 'july', 'August', 'September', 'November', 'December'],
        datasets: [{
          label: 'Oeufs en stock',
          data: salesData,
          borderColor: 'black',
          borderWidth: 1,

        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
        }
      }
    });
    this.depenseChart = new Chart('depenses', {
      type: 'pie',
      data: {
        labels: ['January', 'February', 'March', 'April', 'May', 'June', 'july', 'August', 'September', 'November', 'December'],
        datasets: [{
          label: 'depenses',
          data: salesData,
          borderColor: 'black',
          borderWidth: 1,
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          // x: {
          //   ticks: {
          //     align: 'center', // aligner les étiquettes au centre
          //     padding: 10, // espacement entre l'axe et les étiquettes
          //     font: {
          //       size: 12, // taille de police des étiquettes
          //     },
          //     color: 'black', // couleur de police des étiquettes
          //   // positionner les étiquettes en bas
          //   }
          // }
        }
      }
    });


  }
}
